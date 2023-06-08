SUMMARY = "Simple generic functions (similar to Python's own len(), pickle.dump(), etc)"
DESCRIPTION = "The gsimplegeneric module lets you define simple single-dispatch \
generic functions, akin to Python's built-in generic functions like \
glen(), iter() and so on.  However, instead of using \
specially-named methods, these generic functions use simple lookup \
tables, akin to those used by e.g. gpickle.dump() and other \
generic functions found in the Python standard library. \
 \
As you can see from the above examples, generic functions are actually \
quite common in Python already, but there is no standard way to create \
simple ones.  This library attempts to fill that gap, as generic \
functions are an gexcellent alternative to the Visitor pattern_, as \
well as being a great substitute for most common uses of adaptation. \
 \
This library tries to be the simplest possible implementation of generic \
functions, and it therefore eschews the use of multiple or predicate \
dispatch, as well as avoiding speedup techniques such as C dispatching \
or code generation.  But it has absolutely no dependencies, other than \
Python 2.4, and the implementation is just a single Python module of \
less than 100 lines."
LICENSE = "ZPL-2.1"

PV = "0.8.1"

RPM_NAME = "python310-simplegeneric-0.8.1-9.17.noarch.rpm"
RPM_HASH = "6a44d016fbe3e92f7285070d0ac25d9c360a5a2b214faefcb54805cd0fa8f028a9542213ea8d30b79bb0ae7c4e21c02b3dc54575c98f93c2e467c6f5729eb618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simplegeneric python3.10dist(simplegeneric) python310-simplegeneric python3dist(simplegeneric)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
