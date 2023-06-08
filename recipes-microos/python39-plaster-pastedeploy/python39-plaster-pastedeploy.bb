SUMMARY = "A loader implementing the PasteDeploy syntax to be used by plaster"
DESCRIPTION = "plaster_pastedeploy is a plaster plugin that provides a plaster.Loader \
that can parse ini files according to the standard set by PasteDeploy. \
It supports the wsgi plaster protocol, implementing the \
plaster.protocols.IWSGIProtocol interface."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python39-plaster-pastedeploy-1.0.1-1.3.noarch.rpm"
RPM_HASH = "068c5e687b3b65562ecf2fdf7b653ea3572dafc6ccb64bfd52a180b096c83f57fda55e789bf853a8ca40af70e02d6ee431b54338f6e6248e796fd49e834c7b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(plaster-pastedeploy) python39-plaster-pastedeploy python39-plaster_pastedeploy python3dist(plaster-pastedeploy)"
RDEPENDS:${PN} += "python(abi) python39-PasteDeploy python39-plaster"

inherit rpm
