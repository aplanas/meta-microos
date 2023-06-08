SUMMARY = "Perl extension for the DBus message system"
DESCRIPTION = "Net::DBus provides a Perl API for the DBus message system. The DBus Perl \
interface is currently operating against the 0.32 development version of \
DBus, but should work with later versions too, providing the API changes \
have not been too drastic. \
 \
Users of this package are either typically, service providers in which case \
the Net::DBus::Service and Net::DBus::Object modules are of most relevance, \
or are client consumers, in which case Net::DBus::RemoteService and \
Net::DBus::RemoteObject are of most relevance."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "perl-Net-DBus-1.2.0-1.17.aarch64.rpm"
RPM_HASH = "ab690c485868cde7e2f3fda1f4ebcc6e3082c677439bbd1a9975e6e823d42ad34c298abd37509c2ab0e0e0a6094a18053a3cac5e05f7691bfe2f8a03da429663"

RPROVIDES:${PN} += "perl(Net::DBus) perl(Net::DBus::ASyncReply) perl(Net::DBus::Annotation) perl(Net::DBus::BaseObject) perl(Net::DBus::Binding::Bus) perl(Net::DBus::Binding::Connection) perl(Net::DBus::Binding::Introspector) perl(Net::DBus::Binding::Iterator) perl(Net::DBus::Binding::Message) perl(Net::DBus::Binding::Message::Error) perl(Net::DBus::Binding::Message::MethodCall) perl(Net::DBus::Binding::Message::MethodReturn) perl(Net::DBus::Binding::Message::Signal) perl(Net::DBus::Binding::PendingCall) perl(Net::DBus::Binding::Server) perl(Net::DBus::Binding::Value) perl(Net::DBus::Binding::Watch) perl(Net::DBus::Callback) perl(Net::DBus::Dumper) perl(Net::DBus::Error) perl(Net::DBus::Exporter) perl(Net::DBus::Object) perl(Net::DBus::ProxyObject) perl(Net::DBus::Reactor) perl(Net::DBus::RemoteObject) perl(Net::DBus::RemoteService) perl(Net::DBus::Service) perl(Net::DBus::Test::MockConnection) perl(Net::DBus::Test::MockIterator) perl(Net::DBus::Test::MockMessage) perl(Net::DBus::Test::MockObject) perl-Net-DBus perl-Net-DBus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(XML::Twig)"

inherit rpm
