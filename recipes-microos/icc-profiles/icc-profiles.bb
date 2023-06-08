SUMMARY = "OpenICC Data with complete ICC profiles"
DESCRIPTION = "The meta package installs a complete set of ICC profiles from the OpenICC \
Data collection. One Cmyk profile is contained."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-1.2-16.21.noarch.rpm"
RPM_HASH = "d70ca29733665a63cdb819ee7d17f4886437122ac739867851b9f8e967aeea2df1fcebed63ae25014259b2be5c150fb8eb1e62ca1594879e828fc18084876b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles openicc-data"
RDEPENDS:${PN} += "icc-profiles-basiccolor-printing2009-coat2 icc-profiles-mini"

inherit rpm
