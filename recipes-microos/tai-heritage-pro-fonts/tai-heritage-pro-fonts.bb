SUMMARY = "Tai Viet Font"
DESCRIPTION = "The Tai Heritage Pro font is a Unicode-encoded font designed to reflect the \
traditional hand-written style of the Tai Viet script, which is used by the \
Tai Dam, Tai Daeng and Tai Don people who live in northwestern Vietnam and \
surrounding areas."
LICENSE = "OFL-1.1"

PV = "2.500"

RPM_NAME = "tai-heritage-pro-fonts-2.500-3.17.noarch.rpm"
RPM_HASH = "9023e105f891fd7fc81e1a14451367fc2456f0faea3887ae654b34af8452417f59f2187515056887f3d7bc6a46dbb3742ec53bbff099f6f04f6facc280e97014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tai-heritage-pro-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
