SUMMARY = "Binary files of listings-ext"
DESCRIPTION = "Binary files of listings-ext"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15093"

RPM_NAME = "texlive-listings-ext-bin-2023.20230311.svn15093-89.1.aarch64.rpm"
RPM_HASH = "385e882c15898e4431513076ba87dcd3b5f0b1b03c62051bf11769a5dfacc8d6f5c38af649fc00527f7688ebc77e0e465515a4492bdbab51e9718335b4673e68"

RPROVIDES:${PN} += "texlive-listings-ext-bin texlive-listings-ext-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-listings-ext"

inherit rpm
