SUMMARY = "Ruby Interactive Documentation"
DESCRIPTION = "This package contains the RI docs for ruby"
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "ruby3.2-doc-ri-3.2.2-1.1.noarch.rpm"
RPM_HASH = "01fc04a8b34b12f2c9b0ecd599da079bca49db7f64a937f70994b3614d68be7f385a553cfff6a878ba13630245036d8005f17aab715cd15617afa01b784cb0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby3.2-doc-ri"
RDEPENDS:${PN} += "ruby3.2"

inherit rpm
