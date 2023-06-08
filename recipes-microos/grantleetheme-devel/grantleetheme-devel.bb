SUMMARY = "Development package for grantleetheme"
DESCRIPTION = "The development package for the grantleetheme library"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "grantleetheme-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "25b539b2780fda0b001b5ea587c61047e860eb4c232f1b859f3fc42c622d2227a68272d99a887808b675be80e2e71181fde3d1d5d6eaf31a86dc529afd4ec3a3"

RPROVIDES:${PN} += "cmake(KF5GrantleeTheme) cmake(KPim5GrantleeTheme) grantleetheme-devel grantleetheme-devel(aarch-64)"
RDEPENDS:${PN} += "libKPim5GrantleeTheme5"

inherit rpm
