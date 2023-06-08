SUMMARY = "OpenICC Data with minimal ICC profiles"
DESCRIPTION = "The meta package installs a minimal set of ICC profiles from the OpenICC \
Data collection. No Cmyk and Gray profiles are contained."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-mini-1.2-16.21.noarch.rpm"
RPM_HASH = "4d8d122f8300a4199093aacf3c5b3b05fa56326552796eb6376301d58151be932a6a0072c4492f24dc5fe4386dee40c04eadb94a59661420a03acc0ea2c9bb5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-mini"
RDEPENDS:${PN} += "icc-profiles-basiccolor-lstarrgb icc-profiles-lcms-lab icc-profiles-openicc-rgb"

inherit rpm
