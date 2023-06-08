SUMMARY = "Printing Profiles Documentation from basICColor"
DESCRIPTION = "Printing profiles according to ISO 12647-2. These are CMYK \
ICC profiles documentation files for ISO Printing conditions."
LICENSE = "Zlib"

PV = "1.2.0"

RPM_NAME = "icc-profiles-basiccolor-printing2009-doc-1.2.0-13.17.noarch.rpm"
RPM_HASH = "26943f8ad5fd0850581dfcc269fc2b7a834127a4cff1f0adb5b943aea54e841837a5b7e9b37cef3985aa57176a33069e455234a0cf7130a7ae29abcd2e10a68c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-basiccolor-printing2009-doc"
RDEPENDS:${PN} += ""

inherit rpm
