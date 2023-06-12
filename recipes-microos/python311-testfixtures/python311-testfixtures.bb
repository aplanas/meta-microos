SUMMARY = "A collection of helpers and mock objects for unit tests and doc tests"
DESCRIPTION = "TestFixtures is a collection of helpers and mock objects that are \
useful when writing unit tests or doc tests. \
 \
If you're wondering why 'yet another mock object library', testing is \
often described as an art form and as such some styles of library will \
suit some people while others will suit other styles. This library \
contains common test fixtures the author found himself \
repeating from package to package and so decided to extract them into \
their own library and give them some tests of their own!"
LICENSE = "MIT"

PV = "7.0.4"

RPM_NAME = "python311-testfixtures-7.0.4-1.3.noarch.rpm"
RPM_HASH = "fbb419fd172f10b5c61d1dfdc43178398009eae62ae3fd35f31a1d82f4bcdc144b1d1fa0639ee5915b8799ccf7969a9c6922bdc1087776f7929e6064b5cf1fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(testfixtures) \
python311-testfixtures \
python3dist(testfixtures)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
