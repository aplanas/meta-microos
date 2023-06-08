SUMMARY = "Future-returning IO methods"
DESCRIPTION = "This package provides a few basic methods that behave similarly to the \
same-named core perl functions relating to IO operations, but yield their \
results asynchronously via Future instances. \
 \
This is provided primarily as a decoupling mechanism, to allow modules to \
be written that perform IO in an asynchronous manner to depend directly on \
this, while allowing asynchronous event systems to provide an \
implementation of these operations."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-Future-IO-0.13-1.1.noarch.rpm"
RPM_HASH = "34bc85f205464cf8f5ffd82065216ea6740623522359d49933d01226b5490706690193246fa9d7a4e2ed7f3bbd3c6ce10336cda9e1973b406884ffc48f0c7d26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Future::IO) perl(Future::IO::ImplBase) perl(Future::IO::System) perl(Test::Future::IO::Impl) perl-Future-IO"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Future) perl(Struct::Dumb)"

inherit rpm
