SUMMARY = "A Sphinx-doc theme based on Vuepress"
DESCRIPTION = "Sphinx Press is a modern responsive theme for python’s Sphinx docs. \
 \
This theme is based on VuePress. It uses Vue.js & Stylus managed by vite."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python310-sphinx_press_theme-0.8.0-1.3.noarch.rpm"
RPM_HASH = "af0e0ab277fbdca12883b6816ccf5c65cf61ce235ad9c7a54909ca3c7facbdf2b60afed5b33e431586b616cd91c3913eb3b971ba3b59655e428e0fa653d19d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx_press_theme \
python3.10dist(sphinx-press-theme) \
python310-sphinx_press_theme \
python3dist(sphinx-press-theme)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx"

inherit rpm
