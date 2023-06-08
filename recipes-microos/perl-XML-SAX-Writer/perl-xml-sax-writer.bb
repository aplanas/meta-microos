SUMMARY = "SAX2 XML Writer"
DESCRIPTION = "SAX2 XML Writer"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.57"

RPM_NAME = "perl-XML-SAX-Writer-0.57-1.22.noarch.rpm"
RPM_HASH = "368005fbf83bfe5ed95d70868dbf277827ff2b0d95880bc2853e73312b70666138c82cf5c498bd046667648e1bab2aa647adba02d313e9afdfabd8a3d4b066ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::SAX::Writer) perl(XML::SAX::Writer::ArrayConsumer) perl(XML::SAX::Writer::CodeConsumer) perl(XML::SAX::Writer::ConsumerInterface) perl(XML::SAX::Writer::Encode) perl(XML::SAX::Writer::FileConsumer) perl(XML::SAX::Writer::HandleConsumer) perl(XML::SAX::Writer::NullConverter) perl(XML::SAX::Writer::StringConsumer) perl(XML::SAX::Writer::XML) perl-XML-SAX-Writer"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(XML::Filter::BufferText) perl(XML::NamespaceSupport) perl(XML::SAX::Exception)"

inherit rpm
