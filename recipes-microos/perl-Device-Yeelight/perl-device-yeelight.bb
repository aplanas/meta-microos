SUMMARY = "Controller for Yeelight smart devices"
DESCRIPTION = "Controller for Yeelight smart devices"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-Device-Yeelight-0.13-1.9.noarch.rpm"
RPM_HASH = "927ccbd4874d33acb5a9eb8915e859ddfdd0bb34a9902330f74e62a9730506e4a157a00f41196cd7892915a6f55bb297d66cc2868ca1d38a517d665bd349f6d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Device::Yeelight) perl(Device::Yeelight::Light) perl-Device-Yeelight"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(IO) perl(IO::Socket::Multicast) perl(JSON)"

inherit rpm
