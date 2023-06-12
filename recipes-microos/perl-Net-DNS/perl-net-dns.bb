SUMMARY = "Perl Interface to the Domain Name System"
DESCRIPTION = "Net::DNS is a collection of Perl modules that act as a Domain Name System \
(DNS) resolver. It allows the programmer to perform DNS queries that are \
beyond the capabilities of 'gethostbyname' and 'gethostbyaddr'. \
 \
The programmer should be familiar with the structure of a DNS packet and \
the zone file presentation format described in RFC1035."
LICENSE = "MIT"

PV = "1.38"

RPM_NAME = "perl-Net-DNS-1.38-1.1.noarch.rpm"
RPM_HASH = "c93610d0ad07189ce63ee5042c7664d8488ececb85d49611dd761aa87b583a968d53e3362db315f9bed702d0f77f4dcd94ac5c41672d91d19b78a3799bfb94a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::DNS) perl(Net::DNS::Domain) perl(Net::DNS::DomainName) perl(Net::DNS::DomainName1035) perl(Net::DNS::DomainName2535) perl(Net::DNS::Header) perl(Net::DNS::Mailbox) perl(Net::DNS::Mailbox1035) perl(Net::DNS::Mailbox2535) perl(Net::DNS::Nameserver) perl(Net::DNS::Packet) perl(Net::DNS::Parameters) perl(Net::DNS::Question) perl(Net::DNS::RR) perl(Net::DNS::RR::A) perl(Net::DNS::RR::AAAA) perl(Net::DNS::RR::AFSDB) perl(Net::DNS::RR::AMTRELAY) perl(Net::DNS::RR::APL) perl(Net::DNS::RR::APL::Item) perl(Net::DNS::RR::CAA) perl(Net::DNS::RR::CDNSKEY) perl(Net::DNS::RR::CDS) perl(Net::DNS::RR::CERT) perl(Net::DNS::RR::CNAME) perl(Net::DNS::RR::CSYNC) perl(Net::DNS::RR::DHCID) perl(Net::DNS::RR::DNAME) perl(Net::DNS::RR::DNSKEY) perl(Net::DNS::RR::DS) perl(Net::DNS::RR::EUI48) perl(Net::DNS::RR::EUI64) perl(Net::DNS::RR::GPOS) perl(Net::DNS::RR::HINFO) perl(Net::DNS::RR::HIP) perl(Net::DNS::RR::HTTPS) perl(Net::DNS::RR::IPSECKEY) perl(Net::DNS::RR::ISDN) perl(Net::DNS::RR::KEY) perl(Net::DNS::RR::KX) perl(Net::DNS::RR::L32) perl(Net::DNS::RR::L64) perl(Net::DNS::RR::LOC) perl(Net::DNS::RR::LP) perl(Net::DNS::RR::MB) perl(Net::DNS::RR::MG) perl(Net::DNS::RR::MINFO) perl(Net::DNS::RR::MR) perl(Net::DNS::RR::MX) perl(Net::DNS::RR::NAPTR) perl(Net::DNS::RR::NID) perl(Net::DNS::RR::NS) perl(Net::DNS::RR::NSEC) perl(Net::DNS::RR::NSEC3) perl(Net::DNS::RR::NSEC3PARAM) perl(Net::DNS::RR::NULL) perl(Net::DNS::RR::OPENPGPKEY) perl(Net::DNS::RR::OPT) perl(Net::DNS::RR::OPT::CHAIN) perl(Net::DNS::RR::OPT::CLIENT_SUBNET) perl(Net::DNS::RR::OPT::COOKIE) perl(Net::DNS::RR::OPT::DAU) perl(Net::DNS::RR::OPT::DHU) perl(Net::DNS::RR::OPT::EXPIRE) perl(Net::DNS::RR::OPT::EXTENDED_ERROR) perl(Net::DNS::RR::OPT::KEY_TAG) perl(Net::DNS::RR::OPT::N3U) perl(Net::DNS::RR::OPT::NSID) perl(Net::DNS::RR::OPT::PADDING) perl(Net::DNS::RR::OPT::REPORT_CHANNEL) perl(Net::DNS::RR::OPT::TCP_KEEPALIVE) perl(Net::DNS::RR::PTR) perl(Net::DNS::RR::PX) perl(Net::DNS::RR::RP) perl(Net::DNS::RR::RRSIG) perl(Net::DNS::RR::RT) perl(Net::DNS::RR::SIG) perl(Net::DNS::RR::SMIMEA) perl(Net::DNS::RR::SOA) perl(Net::DNS::RR::SPF) perl(Net::DNS::RR::SRV) perl(Net::DNS::RR::SSHFP) perl(Net::DNS::RR::SVCB) perl(Net::DNS::RR::TKEY) perl(Net::DNS::RR::TLSA) perl(Net::DNS::RR::TSIG) perl(Net::DNS::RR::TXT) perl(Net::DNS::RR::URI) perl(Net::DNS::RR::X25) perl(Net::DNS::RR::ZONEMD) perl(Net::DNS::Resolver) perl(Net::DNS::Resolver::Base) perl(Net::DNS::Resolver::MSWin32) perl(Net::DNS::Resolver::Recurse) perl(Net::DNS::Resolver::UNIX) perl(Net::DNS::Resolver::android) perl(Net::DNS::Resolver::cygwin) perl(Net::DNS::Resolver::os2) perl(Net::DNS::Resolver::os390) perl(Net::DNS::Text) perl(Net::DNS::Update) perl(Net::DNS::ZoneFile) perl(Net::DNS::ZoneFile::Generator) perl(Net::DNS::ZoneFile::Text) perl-Net-DNS"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Carp) perl(Digest::HMAC) perl(Digest::SHA) perl(Encode) perl(Exporter) perl(File::Spec) perl(IO::File) perl(IO::Socket) perl(IO::Socket::IP) perl(PerlIO) perl(Scalar::Util) perl(Time::Local)"

inherit rpm
