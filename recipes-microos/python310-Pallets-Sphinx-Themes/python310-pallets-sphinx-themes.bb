SUMMARY = "Themes for the Pallets projects."
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-Pallets-Sphinx-Themes-2.0.3-2.1.noarch.rpm"
RPM_HASH = "b5eae212be7e268aae6474b5fc028b092c10649b55ef4ac250590a2bc5c2c7c3410c86641ed0d25cab0816291441b1ff118b5244f229efff15c5adeee147a65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pallets-Sphinx-Themes python3.10dist(pallets-sphinx-themes) python310-Pallets-Sphinx-Themes python3dist(pallets-sphinx-themes)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx python310-packaging"

inherit rpm
