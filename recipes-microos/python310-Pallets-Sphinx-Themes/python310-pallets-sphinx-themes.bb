SUMMARY = "Themes for the Pallets projects."
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-Pallets-Sphinx-Themes-2.1.0-1.1.noarch.rpm"
RPM_HASH = "1251856c0d3f4756a1308d637956ba8141b2129739afa6aaac10c6ae40d4278a97a7ec1c305444346ee5869904ca34fde01ed01a6c5787c216aa3b057ff6fa3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pallets-Sphinx-Themes \
python3.10dist(pallets-sphinx-themes) \
python310-Pallets-Sphinx-Themes \
python3dist(pallets-sphinx-themes)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx \
python310-packaging"

inherit rpm
