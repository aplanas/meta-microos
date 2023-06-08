SUMMARY = "Themes for the Pallets projects."
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-Pallets-Sphinx-Themes-2.0.3-2.1.noarch.rpm"
RPM_HASH = "4e4f24bdf475e9b71892d5c1c2a28e5b07b69968944061c0fd57fa1531fb019cc50df38a60a31a5d45fff9235f49d9d27cca9adf58850296369f4684848331f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pallets-sphinx-themes) python39-Pallets-Sphinx-Themes python3dist(pallets-sphinx-themes)"
RDEPENDS:${PN} += "python(abi) python39-Sphinx python39-packaging"

inherit rpm
