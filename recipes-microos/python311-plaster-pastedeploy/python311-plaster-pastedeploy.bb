SUMMARY = "A loader implementing the PasteDeploy syntax to be used by plaster"
DESCRIPTION = "plaster_pastedeploy is a plaster plugin that provides a plaster.Loader \
that can parse ini files according to the standard set by PasteDeploy. \
It supports the wsgi plaster protocol, implementing the \
plaster.protocols.IWSGIProtocol interface."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-plaster-pastedeploy-1.0.1-1.3.noarch.rpm"
RPM_HASH = "1a523b33adb0d652bdfcdb203191caf3e2750431e95797d1f84c0645701c657ec2453e472908e80cc502d9472d570cb68c640aaa897bd281235c3f6196750b68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(plaster-pastedeploy) python311-plaster-pastedeploy python311-plaster_pastedeploy python3dist(plaster-pastedeploy)"
RDEPENDS:${PN} += "python(abi) python311-PasteDeploy python311-plaster"

inherit rpm
