SUMMARY = "Object oriented interface to SNMP"
DESCRIPTION = "The Net::SNMP module abstracts the intricate details of the Simple \
Network Management Protocol by providing a high level programming \
interface to the protocol. Each Net::SNMP object provides a one-to-one \
mapping between a Perl object and a remote SNMP agent or manager. Once an \
object is created, it can be used to perform the basic protocol exchange \
actions defined by SNMP. \
 \
Authors: \
-------- \
    David M. Town <dtown@fore.com>"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "6.0.1"

RPM_NAME = "perl-Net-SNMP-6.0.1-20.24.noarch.rpm"
RPM_HASH = "e9695af9480fc6d3ade59fca54acdf076b13e2574ad23a74bed2fa8988aa2210b58af34957062a84ad22ec62be93f9f109c973012c279441b268a7282d93aa63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::SNMP) perl(Net::SNMP::Dispatcher) perl(Net::SNMP::Message) perl(Net::SNMP::MessageProcessing) perl(Net::SNMP::PDU) perl(Net::SNMP::Security) perl(Net::SNMP::Security::Community) perl(Net::SNMP::Security::USM) perl(Net::SNMP::Transport) perl(Net::SNMP::Transport::IPv4) perl(Net::SNMP::Transport::IPv4::TCP) perl(Net::SNMP::Transport::IPv4::UDP) perl(Net::SNMP::Transport::IPv6) perl(Net::SNMP::Transport::IPv6::TCP) perl(Net::SNMP::Transport::IPv6::UDP) perl-Net-SNMP"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(Carp) perl(Crypt::DES) perl(Crypt::Rijndael) perl(Digest::HMAC) perl(Digest::MD5) perl(Digest::SHA1) perl(Errno) perl(Exporter) perl(IO::Socket) perl(Socket6)"

inherit rpm
