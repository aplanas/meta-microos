SUMMARY = "A fully tested, abstract interface to creating OAuth clients and servers"
DESCRIPTION = "This code was originally forked from Leah Culver and Andy Smith's oauth.py code. \
Some of the tests come from a fork by Vic Fryzel, while a revamped Request \
class and more tests were merged in from Mark Paschal's fork. After a hiatus \
the project was taken over by Daniel Holmes the current maintainer"
LICENSE = "MIT"

PV = "1.9.0.post1"

RPM_NAME = "python311-oauth2-1.9.0.post1-5.5.noarch.rpm"
RPM_HASH = "91bc9e19f272f57c3426e2f601e845579a354e5b2bef8b866bc9f24d080756b8eeaa420aeefe9c085c3c1be1a7f0cdfa7c9bc70defa3e154f65668c239cd0d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(oauth2) python311-oauth2 python3dist(oauth2)"
RDEPENDS:${PN} += "python(abi) python311-httplib2"

inherit rpm
