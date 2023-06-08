SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "0.15.2"

RPM_NAME = "python310-pytest-djangoapp-0.15.2-2.7.noarch.rpm"
RPM_HASH = "049c6de995da754c6bc99d48155b2fe9bfff88f09d3148e18fb83f81d9908bb271eb77abb86ee3926bb9cc38c897a788b901ac73adde612d73ccfec371e541ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-djangoapp python3.10dist(pytest-djangoapp) python310-pytest-djangoapp python3dist(pytest-djangoapp)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-pytest"

inherit rpm
