SUMMARY = "Shims to make deprecation of pytz easier"
DESCRIPTION = "pytz has served the Python community well for many years, but it is no longer \
the best option for providing time zones. pytz has a non-standard interface \
that is very easy to misuse; this interface was necessary when pytz was \
created, because datetime had no way to represent ambiguous datetimes, but this \
was solved in in Python 3.6, which added a fold attribute to datetimes in PEP \
495. With the addition of the zoneinfo module in Python 3.9 (PEP 615), there \
has never been a better time to migrate away from pytz. \
 \
However, since pytz time zones are used very differently from a standard \
tzinfo, and many libraries have built pytz zones into their standard time zone \
interface (and thus may have users relying on the existence of the localize and \
normalize methods); this library provides shim classes that are compatible with \
both PEP 495 and pytz’s interface, to make it easier for libraries to deprecate \
pytz."
LICENSE = "Apache-2.0"

PV = "0.1.0.post0"

RPM_NAME = "python39-pytz-deprecation-shim-0.1.0.post0-4.1.noarch.rpm"
RPM_HASH = "1fd88cc8bb1f63282484869ba2a8dcee02d92cd29def3bc0933ce95f9ad0c8069ea27dc6530454e7a51f90503f74411dbf0aa1daf2d9319e580cd314f9af9080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytz-deprecation-shim) python39-pytz-deprecation-shim python3dist(pytz-deprecation-shim)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
