SUMMARY = "Explicitly typed attributes for Python"
DESCRIPTION = "The traits package developed by Enthought provides a special type definition \
called a trait. Although they can be used as normal Python object attributes, \
traits also have several additional characteristics: \
 \
 * Initialization: A trait can be assigned a default value. \
 * Validation: A trait attribute's type can be explicitly declared. \
 * Delegation: The value of a trait attribute can be contained either \
   in another object. \
 * Notification: Setting the value of a trait attribute can trigger \
   notification of other parts of the program. \
 * Visualization: User interfaces that permit the interactive \
   modification of a trait's value can be automatically constructed \
   using the trait's definition. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.1-only"

PV = "6.3.1"

RPM_NAME = "python39-traits-6.3.1-1.10.aarch64.rpm"
RPM_HASH = "fc67794a152962574d41a1f24bd7ef9091ab3b3f1044864cf30189d470bd7b5b04085d3a67be53d4f76ee55a216d68abff59195557376c9aad822b9b53fc30da"

RPROVIDES:${PN} += "python3.9dist(traits) \
python39-traits \
python39-traits(aarch-64) \
python3dist(traits)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
