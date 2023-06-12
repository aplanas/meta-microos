SUMMARY = "Job scheduling module for Python"
DESCRIPTION = "An in-process scheduler for periodic jobs that uses the builder \
pattern for configuration. Schedule lets the user run Python functions \
(or any other callable) periodically at pre-determined intervals."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-schedule-1.1.0-3.6.noarch.rpm"
RPM_HASH = "6f9610e45b4bc4261cb9345770356c43f95af818e09be9fb9aeb7ef90a346391aec93b300a6a8540376b8d9053137c67defafdf161d377c8eb7036c8b1bba2aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(schedule) \
python39-schedule \
python3dist(schedule)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
