SUMMARY = "Build backend for CMake based projects"
DESCRIPTION = "Python CMake adaptor and Python API for plugins \
 \
Features over classic Scikit-build: \
  - Better warnings, errors, and logging \
  - No warning about unused variables \
  - Automatically adds Ninja and/or CMake only as required \
  - No dependency on setuptools, distutils, or wheel in build mode. \
  - Powerful config system, including config options support in build mode. \
  - Automatic inclusion of site-packages in CMAKE_PREFIX_PATH \
  - FindPython is backported if running on CMake < 3.24 (included via hatchling in a submodule, configurable) \
  - Limited API / Stable ABI and pythonless tags supported via config option \
  - No slow generator search, ninja/make or MSVC used by default, respects CMAKE_GENERATOR \
  - SDists are reproducible by default (UNIX, Python 3.9+)"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python310-scikit-build-core-0.2.2-1.1.noarch.rpm"
RPM_HASH = "70ddd9857a5fa25ba869bcbc558ee43d93bf181640fafef33729f7bbe26f51f9aed5bc259255a472501e565416baa960f48ff3803c8a59baa6eb7cb2c3b4e41c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-build-core python3-scikit_build_core python3.10dist(scikit-build-core) python310-scikit-build-core python310-scikit_build_core python3dist(scikit-build-core)"
RDEPENDS:${PN} += "(python310-exceptiongroup if python310-base < 3.11) (python310-importlib-resources >= 1.3 if python310-base < 3.9) (python310-tomli >= 1.1 if python310-base < 3.11) (python310-typing-extensions >= 3.10.0 if python310-base < 3.8) cmake python(abi) python310-packaging"

inherit rpm
