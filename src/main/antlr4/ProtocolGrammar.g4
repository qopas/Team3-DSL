grammar ProtocolGrammar;

protocol : agent_definitions message_definitions;

agent_definitions : agent_definition+;
agent_definition : 'Agent' agent_name ':' agent_type ';';

agent_name : IDENTIFIER;
agent_type : IDENTIFIER;

message_definitions : message_definition+;
message_definition : 'Message' message_name ':' message_type message_properties ';';

message_name : IDENTIFIER;
message_type : 'Text' | 'Audio' | 'Image';

message_properties : message_property+;
message_property : 'Prompt:' prompt_value | 'Description:' description_value;

prompt_value : STRING;
description_value : STRING;

IDENTIFIER : [a-zA-Z]+;
STRING : '"' ( ~["\\] | '\\' . )* '"';
