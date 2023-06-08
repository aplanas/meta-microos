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

RPM_NAME = "python39-scikit-build-core-0.2.2-1.1.noarch.rpm"
RPM_HASH = "bf4f56a990f6bb6d11c7aba49e7dff53ac274048a3dc82238195ba1266ffdf204a56680bec702e4714495e26e174e63f654501a87eb69de8c7dca8511b45a3ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(scikit-build-core) python39-scikit-build-core python39-scikit_build_core python3dist(scikit-build-core)"
RDEPENDS:${PN} += "(python39-exceptiongroup if python39-base < 3.11) (python39-importlib-resources >= 1.3 if python39-base < 3.9) (python39-tomli >= 1.1 if python39-base < 3.11) (python39-typing-extensions >= 3.10.0 if python39-base < 3.8) cmake python(abi) python39-packaging"

inherit rpm
