SUMMARY = "An RDF Framework for Perl"
DESCRIPTION = "RDF::Trine provides an Resource Descriptive Framework (RDF) with an \
emphasis on extensibility, API stability, and the presence of a test suite. \
The package consists of several components:"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.019"

RPM_NAME = "perl-RDF-Trine-1.019-1.18.noarch.rpm"
RPM_HASH = "e709d85d3a6683420a3668ae73497661586a3c853b76ba92b733f9936bb120824200e599cd427bf907e889d7ee91aeb59806096dcb11e5160e1974e00a5084f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(RDF::Trine) \
perl(RDF::Trine::Error) \
perl(RDF::Trine::Error::CompilationError) \
perl(RDF::Trine::Error::DatabaseError) \
perl(RDF::Trine::Error::MethodInvocationError) \
perl(RDF::Trine::Error::ParserError) \
perl(RDF::Trine::Error::ParserError::Explainable) \
perl(RDF::Trine::Error::ParserError::Positioned) \
perl(RDF::Trine::Error::ParserError::Tokenized) \
perl(RDF::Trine::Error::QuerySyntaxError) \
perl(RDF::Trine::Error::SerializationError) \
perl(RDF::Trine::Error::UnimplementedError) \
perl(RDF::Trine::Exporter::CSV) \
perl(RDF::Trine::Exporter::RDFPatch) \
perl(RDF::Trine::Graph) \
perl(RDF::Trine::Iterator) \
perl(RDF::Trine::Iterator::Bindings) \
perl(RDF::Trine::Iterator::Bindings::Materialized) \
perl(RDF::Trine::Iterator::Boolean) \
perl(RDF::Trine::Iterator::Graph) \
perl(RDF::Trine::Iterator::Graph::Materialized) \
perl(RDF::Trine::Iterator::JSONHandler) \
perl(RDF::Trine::Iterator::SAXHandler) \
perl(RDF::Trine::Model) \
perl(RDF::Trine::Model::Dataset) \
perl(RDF::Trine::Model::StatementFilter) \
perl(RDF::Trine::Model::Union) \
perl(RDF::Trine::Namespace) \
perl(RDF::Trine::NamespaceMap) \
perl(RDF::Trine::Node) \
perl(RDF::Trine::Node::Blank) \
perl(RDF::Trine::Node::Literal) \
perl(RDF::Trine::Node::Nil) \
perl(RDF::Trine::Node::Resource) \
perl(RDF::Trine::Node::Variable) \
perl(RDF::Trine::Parser) \
perl(RDF::Trine::Parser::LineProtocol) \
perl(RDF::Trine::Parser::NQuads) \
perl(RDF::Trine::Parser::NTriples) \
perl(RDF::Trine::Parser::RDFJSON) \
perl(RDF::Trine::Parser::RDFPatch) \
perl(RDF::Trine::Parser::RDFPatch::Op) \
perl(RDF::Trine::Parser::RDFXML) \
perl(RDF::Trine::Parser::RDFXML::SAXHandler) \
perl(RDF::Trine::Parser::RDFa) \
perl(RDF::Trine::Parser::Redland) \
perl(RDF::Trine::Parser::Redland::NTriples) \
perl(RDF::Trine::Parser::Redland::RDFXML) \
perl(RDF::Trine::Parser::Redland::RDFa) \
perl(RDF::Trine::Parser::Redland::Trig) \
perl(RDF::Trine::Parser::Redland::Turtle) \
perl(RDF::Trine::Parser::TriG) \
perl(RDF::Trine::Parser::Turtle) \
perl(RDF::Trine::Parser::Turtle::Constants) \
perl(RDF::Trine::Parser::Turtle::Lexer) \
perl(RDF::Trine::Parser::Turtle::Token) \
perl(RDF::Trine::Pattern) \
perl(RDF::Trine::Serializer) \
perl(RDF::Trine::Serializer::FileSink) \
perl(RDF::Trine::Serializer::NQuads) \
perl(RDF::Trine::Serializer::NTriples) \
perl(RDF::Trine::Serializer::NTriples::Canonical) \
perl(RDF::Trine::Serializer::RDFJSON) \
perl(RDF::Trine::Serializer::RDFPatch) \
perl(RDF::Trine::Serializer::RDFXML) \
perl(RDF::Trine::Serializer::StringSink) \
perl(RDF::Trine::Serializer::TSV) \
perl(RDF::Trine::Serializer::TriG) \
perl(RDF::Trine::Serializer::Turtle) \
perl(RDF::Trine::Statement) \
perl(RDF::Trine::Statement::Quad) \
perl(RDF::Trine::Store) \
perl(RDF::Trine::Store::DBI) \
perl(RDF::Trine::Store::DBI::Pg) \
perl(RDF::Trine::Store::DBI::SQLite) \
perl(RDF::Trine::Store::DBI::mysql) \
perl(RDF::Trine::Store::Dydra) \
perl(RDF::Trine::Store::Hexastore) \
perl(RDF::Trine::Store::LanguagePreference) \
perl(RDF::Trine::Store::Memory) \
perl(RDF::Trine::Store::Redis) \
perl(RDF::Trine::Store::Redland) \
perl(RDF::Trine::Store::SPARQL) \
perl(RDF::Trine::VariableBindings) \
perl(Test::RDF::Trine::Store) \
perl-RDF-Trine"
RDEPENDS:${PN} += "/usr/bin/env \
perl(:MODULE_COMPAT_5.36.0) \
perl(Algorithm::Combinatorics) \
perl(Cache::LRU) \
perl(DBD::SQLite) \
perl(DBI) \
perl(DBIx::Connector) \
perl(Data::UUID) \
perl(Digest::SHA) \
perl(Error) \
perl(HTTP::Negotiate) \
perl(IRI) \
perl(JSON) \
perl(LWP::UserAgent) \
perl(List::Util) \
perl(Log::Log4perl) \
perl(Module::Load::Conditional) \
perl(Moose) \
perl(MooseX::ArrayRef) \
perl(Scalar::Util) \
perl(Set::Scalar) \
perl(Text::CSV_XS) \
perl(Text::Table) \
perl(URI) \
perl(XML::CommonNS) \
perl(XML::Namespace) \
perl(XML::SAX)"

inherit rpm
