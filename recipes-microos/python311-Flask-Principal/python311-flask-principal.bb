SUMMARY = "Identity management for flask"
DESCRIPTION = "Flask-Principal provides a very loose framework to tie in providers of \
two types of services, often located in different parts of a web application: \
Authentication providers and User information providers."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-Flask-Principal-0.4.0-3.8.noarch.rpm"
RPM_HASH = "a30e87af90f8d86432ba306727cd245237e3309be96609d02afbdae4d7ac15970c6b46ebc8fe1098e08f61192f487fb58f1695c453239e06210c2e94c58488be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-principal) \
python311-Flask-Principal \
python3dist(flask-principal)"
RDEPENDS:${PN} += "python(abi) \
python311-Flask \
python311-blinker"

inherit rpm
