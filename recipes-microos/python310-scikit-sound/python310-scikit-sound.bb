SUMMARY = "Python utilities for working with sound signals"
DESCRIPTION = "Scikit-sound contains functions for working with sound"
LICENSE = "BSD-2-Clause"

PV = "0.2.3"

RPM_NAME = "python310-scikit-sound-0.2.3-3.11.noarch.rpm"
RPM_HASH = "566599cde53b823404dba3f7afeb5182186b555b3edd6f6601c404f7d7431362ccb028a2d2903f716ab72c1296c7a8d0ce1fc83eeeaa9c59a0b3754bd8c29bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-sound \
python3.10dist(scikit-sound) \
python310-scikit-sound \
python3dist(scikit-sound)"
RDEPENDS:${PN} += "python(abi) \
python310-PyYAML \
python310-appdirs \
python310-docutils \
python310-pygame \
python310-scipy"

inherit rpm
