SUMMARY = "Translations for package keepassxc"
DESCRIPTION = "Provides translations for the 'keepassxc' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.7.4"

RPM_NAME = "keepassxc-lang-2.7.4-1.6.noarch.rpm"
RPM_HASH = "f80154ab732c0c3dd216de487efa9a2ad6178f791a4e140196c0e6e96a9a7a9498f04c611a87b170ea41816d3737ed4e775e5dae3e6f4ef1cf9d0dd5fb14561c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keepassxc-lang keepassxc-lang-all"
RDEPENDS:${PN} += "keepassxc"

inherit rpm
