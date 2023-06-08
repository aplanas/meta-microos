SUMMARY = "Polyfill package for Flake8 plugins"
DESCRIPTION = "Flake8-polyfill is a package that provides some compatibility helpers for \
Flake8 plugins that intend to support Flake8 2.x and 3.x simultaneously."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-flake8-polyfill-1.0.2-3.8.noarch.rpm"
RPM_HASH = "58bd97a7e26d25b31e69056f3ab5ce9dbd4036954f0ed44b2db13266dc635481bbea422a00a3314af32361d0eeb2a7f15bfaa867588a1b04404b9a724a8e5a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flake8-polyfill) python311-flake8-polyfill python3dist(flake8-polyfill)"
RDEPENDS:${PN} += "python(abi) python311-flake8"

inherit rpm
