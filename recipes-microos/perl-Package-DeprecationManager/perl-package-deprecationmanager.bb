SUMMARY = "Manage deprecation warnings for your distribution"
DESCRIPTION = "This module allows you to manage a set of deprecations for one or more \
modules. \
 \
When you import 'Package::DeprecationManager', you must provide a set of \
'-deprecations' as a hash ref. The keys are 'feature' names, and the values \
are the version when that feature was deprecated. \
 \
In many cases, you can simply use the fully qualified name of a subroutine \
or method as the feature name. This works for cases where the whole \
subroutine is deprecated. However, the feature names can be any string. \
This is useful if you don't want to deprecate an entire subroutine, just a \
certain usage. \
 \
You can also provide an optional array reference in the '-ignore' \
parameter. \
 \
The values to be ignored can be package names or regular expressions (made \
with 'qr//'). Use this to ignore packages in your distribution that can \
appear on the call stack when a deprecated feature is used. \
 \
As part of the import process, 'Package::DeprecationManager' will export \
two subroutines into its caller. It provides an 'import()' sub for the \
caller and a 'deprecated()' sub. \
 \
The 'import()' sub allows callers of _your_ class to specify an \
'-api_version' parameter. If this is supplied, then deprecation warnings \
are only issued for deprecations with API versions earlier than the one \
specified. \
 \
You must call the 'deprecated()' sub in each deprecated subroutine. When \
called, it will issue a warning using 'Carp::cluck()'. \
 \
The 'deprecated()' sub can be called in several ways. If you do not pass \
any arguments, it will generate an appropriate warning message. If you pass \
a single argument, this is used as the warning message. \
 \
Finally, you can call it with named arguments. Currently, the only allowed \
names are 'message' and 'feature'. The 'feature' argument should correspond \
to the feature name passed in the '-deprecations' hash. \
 \
If you don't explicitly specify a feature, the 'deprecated()' sub uses \
'caller()' to identify its caller, using its fully qualified subroutine \
name. \
 \
A given deprecation warning is only issued once for a given package. This \
module tracks this based on both the feature name _and_ the error message \
itself. This means that if you provide several different error messages for \
the same feature, all of those errors will appear."
LICENSE = "Artistic-2.0"

PV = "0.18"

RPM_NAME = "perl-Package-DeprecationManager-0.18-1.1.noarch.rpm"
RPM_HASH = "366bf40155df133fbfb6f7bfd6a1f80d9d290715a2238109e81b67c036353ac78bda1d04281b477c3dd83121a94bd1814cdd85914fe06948cd6bb4336c14332f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Package::DeprecationManager) perl-Package-DeprecationManager"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(List::Util) perl(Package::Stash) perl(Params::Util) perl(Sub::Install) perl(Sub::Util)"

inherit rpm
