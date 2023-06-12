SUMMARY = "Development files for marisa"
DESCRIPTION = "The marisa-devel package contains libraries and header files for \
developing applications that use marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "marisa-devel-0.2.6-1.21.aarch64.rpm"
RPM_HASH = "66de067393361ba7cf8a116f542228f9cdba9057aa660ecc1c7b94261f4109bbe489e75e70345e36e1ad570afd4067014941dc979f1624416e6fadb307a093a3"

RPROVIDES:${PN} += "marisa-devel \
marisa-devel(aarch-64) \
pkgconfig(marisa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
marisa \
perl-marisa \
python3-marisa \
ruby-marisa"

inherit rpm
