SUMMARY = "A Django middleware that logs tracebacks of slow requests"
DESCRIPTION = "A Django middleware that logs tracebacks of slow requests and allows further inspection."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "python39-dogslow-1.2-1.14.noarch.rpm"
RPM_HASH = "4225a1f6beeb7aecbc478292d8a58f7edf368b977ec32a8159a65eeb72d7c324fd6eda9d55900819fbede24550dc1a9ef2b9154a2e1533273c7379fcf7575848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dogslow) \
python39-dogslow \
python3dist(dogslow)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
