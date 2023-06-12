SUMMARY = "Create a Fake ShareDir for your modules for testing"
DESCRIPTION = "'Test::File::ShareDir' is some low level plumbing to enable a distribution \
to perform tests while consuming its own 'share' directories in a manner \
similar to how they will be once installed. \
 \
This allows 'File::ShareDir' to see the _latest_ version of content instead \
of simply whatever is installed on whichever target system you happen to be \
testing on. \
 \
*Note:* This module only has support for creating 'new' style share dirs \
and are NOT compatible with old File::ShareDirs. \
 \
For this reason, unless you have File::ShareDir 1.00 or later installed, \
this module will not be usable by you."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.001002"

RPM_NAME = "perl-Test-File-ShareDir-1.001002-1.23.noarch.rpm"
RPM_HASH = "495f76f28433a6b2d2fbd33bcb23c53dba38af97e4b2bcc7448af330202afb1d1c56824c7e3a74f4d00d7f03f86a3d25010fba355b2d8fdedba999fa073dc4a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::File::ShareDir) \
perl(Test::File::ShareDir::Dist) \
perl(Test::File::ShareDir::Module) \
perl(Test::File::ShareDir::Object::Dist) \
perl(Test::File::ShareDir::Object::Inc) \
perl(Test::File::ShareDir::Object::Module) \
perl(Test::File::ShareDir::TempDirObject) \
perl(Test::File::ShareDir::Utils) \
perl-Test-File-ShareDir"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Tiny) \
perl(File::Copy::Recursive) \
perl(File::ShareDir) \
perl(Path::Tiny) \
perl(Scope::Guard) \
perl(parent)"

inherit rpm
