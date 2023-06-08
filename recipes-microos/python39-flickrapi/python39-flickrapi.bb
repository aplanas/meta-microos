SUMMARY = "Python interface to Flickr"
DESCRIPTION = "The easiest to use, most complete, and most actively developed \
Python interface to the Flickr API. It includes support for \
authorized and non-authorized access, uploading and replacing \
photos, and all Flickr API functions."
LICENSE = "Python-2.0"

PV = "2.4.0"

RPM_NAME = "python39-flickrapi-2.4.0-3.4.noarch.rpm"
RPM_HASH = "c78cb950050e1c0822079e676c68465c4c392ef87c06bc8ef66e7d7b2e0bc0d7859161c91bc911624a950b494d37f671ffd79e8ae6fbbc1ea7b80c5dc5558f56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flickrapi) python39-flickrapi python3dist(flickrapi)"
RDEPENDS:${PN} += "python(abi) python39-requests python39-requests-oauthlib python39-requests-toolbelt"

inherit rpm
