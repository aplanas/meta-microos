SUMMARY = "Google Authentication Library: httplib2 transport"
DESCRIPTION = "This library provides an `httplib2`_ transport for `google-auth`_."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python39-google-auth-httplib2-0.1.0-2.5.noarch.rpm"
RPM_HASH = "d006fda53ac47f923fbb35aeeccf4fa16456449fabb64ea35aa08934aa2faa4f8b42b157a3cb56ac5b2f1ffe82c45e4a275d223aecd954890e4f5b9788b6ccd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(google-auth-httplib2) python39-google-auth-httplib2 python3dist(google-auth-httplib2)"
RDEPENDS:${PN} += "python(abi) python39-google-auth python39-httplib2 python39-six"

inherit rpm
