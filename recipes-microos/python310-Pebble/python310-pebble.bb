SUMMARY = "Threading and multiprocessing eye-candy for Python"
DESCRIPTION = "Pebble provides an API to manage threads and processes within an application. \
It wraps Python’s standard library threading and multiprocessing objects."
LICENSE = "LGPL-3.0-only"

PV = "5.0.3"

RPM_NAME = "python310-Pebble-5.0.3-1.3.noarch.rpm"
RPM_HASH = "e159efb63a587ee7d76400986e2b87f74b7481c4a2f5fdf9bebee34cfbea93e0b32367aea46aa2b92316d84b1f3d610da79bf0487381f6313029c86c269df83e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pebble python3.10dist(pebble) python310-Pebble python3dist(pebble)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
