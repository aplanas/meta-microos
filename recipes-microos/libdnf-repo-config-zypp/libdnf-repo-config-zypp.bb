SUMMARY = "Enables Zypper repository configuration for DNF"
DESCRIPTION = "This package allows libdnf and all consumers to be able to reuse \
repository configuration files set for Zypper."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.0"

RPM_NAME = "libdnf-repo-config-zypp-0.70.0-1.3.aarch64.rpm"
RPM_HASH = "20207f537eb2cbb58b1b5e894229ccadd87a642342e0edf4451298053568689b79f41f418279b7db1ea39b8061ee926f2f5da6292adca9c38e1737a1653212a9"

RPROVIDES:${PN} += "libdnf-repo-config-zypp libdnf-repo-config-zypp(aarch-64) rpm-repos-openSUSE"
RDEPENDS:${PN} += "(product(SUSE_SLE) or suse-release)"

inherit rpm
