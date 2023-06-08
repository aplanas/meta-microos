SUMMARY = "Themes for the Pallets projects."
DESCRIPTION = "Themes for the Pallets projects. If you’re writing an extension, use \
the appropriate theme to make your documentation look consistent. \
Available themes: flask, jinja, werkzeug, click"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-Pallets-Sphinx-Themes-2.0.3-2.1.noarch.rpm"
RPM_HASH = "2d76a38de1b68d075498f2de30fd857647df3bcbe1b1df90567f4a02f34e7a964755d7006330fa99faff8c5827c11427f0db034bf7e3e9ebb15e54bc0dd30e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pallets-sphinx-themes) python311-Pallets-Sphinx-Themes python3dist(pallets-sphinx-themes)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx python311-packaging"

inherit rpm
