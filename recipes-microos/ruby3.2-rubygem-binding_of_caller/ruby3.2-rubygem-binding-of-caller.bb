SUMMARY = "Retrieve the binding of a method's caller, or further up the stack"
DESCRIPTION = "Provides the Binding#of_caller method. \
Using binding_of_caller we can grab bindings from higher up the call stack and \
evaluate code in that context. \
Allows access to bindings arbitrarily far up the call stack, not limited to \
just the immediate caller. \
Recommended for use only in debugging situations. Do not use this in \
production apps."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "ruby3.2-rubygem-binding_of_caller-1.0.0-1.13.aarch64.rpm"
RPM_HASH = "09387b6c24995c85d812dc7ff75c22eebd891ce7ed131b9ef4fb00aff7d899ac6076a441c5358991ec0d68454ad035ca8a27e9c42f5868ecc3c515fccb4d841c"

RPROVIDES:${PN} += "ruby3.2-rubygem-binding_of_caller \
ruby3.2-rubygem-binding_of_caller(aarch-64) \
rubygem(binding_of_caller) \
rubygem(ruby:3.2.0:binding_of_caller) \
rubygem(ruby:3.2.0:binding_of_caller:1) \
rubygem(ruby:3.2.0:binding_of_caller:1.0) \
rubygem(ruby:3.2.0:binding_of_caller:1.0.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:debug_inspector)"

inherit rpm
