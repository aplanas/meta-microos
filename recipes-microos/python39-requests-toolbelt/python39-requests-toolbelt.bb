SUMMARY = "A utility belt for advanced users of python3-requests"
DESCRIPTION = "This is just a collection of utilities for `python-requests`_, but don't \
really belong in ``requests`` proper. The minimum tested requests version is \
``2.1.0``. In reality, the toolbelt should work with ``2.0.1`` as well, but \
some idiosyncracies prevent effective or sane testing on that version."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-requests-toolbelt-1.0.0-1.1.noarch.rpm"
RPM_HASH = "71aaa942d8635d31f276794536b2020d874577ad88e0652cc0f975548fefc2d13b72456b51b39968e97a5c7c080d589c05a872b0af724a11d7479510cc3aa0f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-toolbelt) python39-requests-toolbelt python3dist(requests-toolbelt)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
