SUMMARY = "Rich architecture for interactive computing with Python"
DESCRIPTION = "IPython provides a rich toolkit to help you make the \
most out of using Python interactively. Its main \
components are: \
 \
 * A powerful interactive Python shell \
 * A Jupyter kernel to work with Python code in \
   Jupyter notebooks and other interactive frontends. \
 \
The enhanced interactive Python shells have the \
following main features: \
 \
 * Comprehensive object introspection. \
 * Input history, persistent across sessions. \
 * Caching of output results during a session with automatically \
   generated references. \
 * Extensible tab completion, with support by default for completion \
   of python variables and keywords, filenames and function keywords. \
 * Extensible system of ‘magic’ commands for controlling the \
   environment and performing many tasks related either to IPython or \
   the operating system. \
 * A rich configuration system with easy switching between different \
   setups (simpler than changing $PYTHONSTARTUP environment variables \
   every time). \
 * Session logging and reloading. \
 * Extensible syntax processing for special purpose situations. \
 * Access to the system shell with user-extensible alias system. \
 * Easily embeddable in other Python programs and GUIs. \
 * Integrated access to the pdb debugger and the Python profiler."
LICENSE = "BSD-3-Clause"

PV = "8.13.1"

RPM_NAME = "python39-ipython-8.13.1-1.1.noarch.rpm"
RPM_HASH = "e6023368d521e0d1f3dac81ae7aff051e5148a939e34ac98f5c93e4f482eb7c3184b1f0302f758ae4a48592f47998e2694be586905ffe042be2132b91df2a38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPython3 application() application(ipython-3.9.desktop) jupyter-ipython python3.9dist(ipython) python39-IPython python39-ipython python39-ipython-doc python39-jupyter_ipython python39-jupyter_ipython-doc python39-jupyter_ipython-doc-html python39-jupyter_ipython-doc-pdf python3dist(ipython)"
RDEPENDS:${PN} += "(python39-prompt_toolkit >= 3.0.38 with python39-prompt_toolkit < 3.1) /bin/sh /usr/bin/python3.9 alts python(abi) python39 python39-backcall python39-decorator python39-jedi python39-matplotlib-inline python39-pexpect python39-pickleshare python39-pygments python39-stack-data python39-traitlets python39-typing-extensions"

inherit rpm
