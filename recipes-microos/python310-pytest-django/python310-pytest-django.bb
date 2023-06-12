SUMMARY = "A Django plugin for Pytest"
DESCRIPTION = "pytest-django allows testing Django projects/applications with the \
pytest testing tool. \
 \
Running the test suite with pytest-django allows tapping into the features \
that are already present in pytest: \
 \
* Manage test dependencies with pytest fixtures. \
* Less boilerplate tests: no need to import unittest and creating a \
  subclass with methods. Tests can be written as regular functions. \
* Database re-use: no need to re-create the test database for every test run. \
* Run tests in multiple processes for increased speed (with the pytest-xdist plugin). \
* Make use of other pytest plugins. \
* Works with both worlds: Existing unittest-style TestCase's still work without any modifications."
LICENSE = "BSD-3-Clause"

PV = "4.5.2"

RPM_NAME = "python310-pytest-django-4.5.2-4.4.noarch.rpm"
RPM_HASH = "d08645fa4b414e477fa0fe93fa41cc0e4a9f308c41bb04a63020ed8c54f835d0334485ffe9a7e98aeef598e1ce02111501c7accb727edd8cc213d203802ac4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-django \
python3.10dist(pytest-django) \
python310-pytest-django \
python3dist(pytest-django)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-pytest"

inherit rpm
