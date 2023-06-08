SUMMARY = "Rake tasks providing tasks to package project in git and integration"
DESCRIPTION = "Rake tasks to allow easy packaging ruby projects in git for Build Service or \
other packaging service."
LICENSE = "LGPL-2.1-only"

PV = "1.5.1"

RPM_NAME = "ruby3.2-rubygem-packaging_rake_tasks-1.5.1-1.11.aarch64.rpm"
RPM_HASH = "3a6de58931b4df5350c76835176c9b3172f96c7751cf05a9609edca4d6607e2db8d2b394f456487a408243d0079ad4cf5705e7e39cbe9af3288c4c61fb6a924f"

RPROVIDES:${PN} += "ruby3.2-rubygem-packaging_rake_tasks ruby3.2-rubygem-packaging_rake_tasks(aarch-64) rubygem(packaging_rake_tasks) rubygem(ruby:3.2.0:packaging_rake_tasks) rubygem(ruby:3.2.0:packaging_rake_tasks:1) rubygem(ruby:3.2.0:packaging_rake_tasks:1.5) rubygem(ruby:3.2.0:packaging_rake_tasks:1.5.1)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:rake)"

inherit rpm
