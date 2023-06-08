SUMMARY = "Client Library for Memcached (Memory Cache Daemon)"
DESCRIPTION = "This is the Perl API for memcached, a distributed memory cache daemon. More \
information is available at: \
 \
  http://www.danga.com/memcached/"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.30"

RPM_NAME = "perl-Cache-Memcached-1.30-1.20.noarch.rpm"
RPM_HASH = "7d365987023e7cf1dfb62703cb811aa58d5c3d966c2e9d8c8e42c1e6dc6ac7658dafed9a77e71855ac1bf260bc5620006627da5be9dd541ad869a102fb34a598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Cache::Memcached) perl(Cache::Memcached::GetParser) perl-Cache-Memcached"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(String::CRC32)"

inherit rpm
