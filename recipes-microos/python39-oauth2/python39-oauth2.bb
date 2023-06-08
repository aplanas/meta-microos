SUMMARY = "A fully tested, abstract interface to creating OAuth clients and servers"
DESCRIPTION = "This code was originally forked from Leah Culver and Andy Smith's oauth.py code. \
Some of the tests come from a fork by Vic Fryzel, while a revamped Request \
class and more tests were merged in from Mark Paschal's fork. After a hiatus \
the project was taken over by Daniel Holmes the current maintainer"
LICENSE = "MIT"

PV = "1.9.0.post1"

RPM_NAME = "python39-oauth2-1.9.0.post1-5.5.noarch.rpm"
RPM_HASH = "f5a3048328c70b2ce0ffb191820724dcc2bca24f21721f2c18dd8a73bbdca4a4c0ba029f3fb0afe017b40ce24b837767e325242fb87e471a46312220d80d8a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(oauth2) python39-oauth2 python3dist(oauth2)"
RDEPENDS:${PN} += "python(abi) python39-httplib2"

inherit rpm
