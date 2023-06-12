SUMMARY = "Sans Fonts for Minority Languages of Russia"
DESCRIPTION = "PT Sans is based on Russian sans serif types of the second part of \
the XX century, but at the same time has a very distinctive features of \
modern humanistic design. The family consists of 8 styles: 4 basic \
styles; 2 captions styles for small sizes and 2 narrows styles for \
economic setting. \
 \
The fonts beside standard Western, Central European and Cyrillic code \
pages contain characters of all title languages of Russian Federation \
that make them unique and very important tool of the modern digital \
communications."
LICENSE = "OFL-1.1"

PV = "2.005OFL"

RPM_NAME = "paratype-pt-sans-fonts-2.005OFL-3.17.noarch.rpm"
RPM_HASH = "03a28d7a711ba2cf6a6807859420bb5d5d3480f49bbd873aad30eb5692818b5b61d73ed4e82c3e750da387c920576c7eda0cb251ec94f92b144750c965f9cec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PTSans-fonts \
locale(be;ru;uk) \
paratype-pt-sans-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
