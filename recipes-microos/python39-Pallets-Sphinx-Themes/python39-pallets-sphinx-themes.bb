SUMMARY = "Themes for the Pallets projects."
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-Pallets-Sphinx-Themes-2.1.0-1.1.noarch.rpm"
RPM_HASH = "113e2b04ec25fafd75750f86cb48b432cffcd72d6b5b0c39fde1d2c7dee2334c7810f5c36bc7e770b77f7ec5c62568ee6b17427ba81278948b0d732e50bb865c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pallets-sphinx-themes) \
python39-Pallets-Sphinx-Themes \
python3dist(pallets-sphinx-themes)"
RDEPENDS:${PN} += "python(abi) \
python39-Sphinx \
python39-packaging"

inherit rpm
