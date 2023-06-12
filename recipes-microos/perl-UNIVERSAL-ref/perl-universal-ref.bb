SUMMARY = "Turns ref() into a multimethod"
DESCRIPTION = "This module changes the behavior of the builtin function ref(). If ref() is \
called on an object that has requested an overloaded ref, the object's \
'->ref' method will be called and its return value used instead."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.14"

RPM_NAME = "perl-UNIVERSAL-ref-0.14-1.13.aarch64.rpm"
RPM_HASH = "a44bbdbcb3ab25017ea4d087aa7c2434a7142efd011e0e759e13ec7b5783bcd8953271d0043f8a5c205e5b5e6142f098db6e11ef1a26f946848585ebc12010fe"

RPROVIDES:${PN} += "perl(UNIVERSAL::ref) \
perl-UNIVERSAL-ref \
perl-UNIVERSAL-ref(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(B::Utils)"

inherit rpm
