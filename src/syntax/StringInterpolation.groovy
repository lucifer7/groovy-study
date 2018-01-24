package syntax

/**
 * Usage: <b> Most important point of Groovy String </b>
 *
 * @author lucifer
 * Date 2018-1-24
 * Device Aurora R5
 */
// ${} as placeholder
def name = "lucifer"
def str = "Hello ${name}"
println str

// $ for dotted expression
def person = [name: name, city: "shanghai"]
def dotted = "Hello $person.city"
println dotted

// expression is supported
println "expression of ${2 + 2}"

// single quote is java.lang.String, no interpolation
// double quote is GString, \ can escape interpolation
assert '${name}' == "\${name}"

// ${->} as closure expression, with no param
def paramlessClosure = "1 + 2 == ${-> 3}"
println paramlessClosure
// closure with param, << as leftShift operator
def paramClosure = "1 + 2 == ${w -> w << 1}"
println paramClosure

// Also closure could serve as lazy string
def eagerStr = "eager string: ${name}"
def lazyStr = "lazy string: ${-> name}"
name = "luciferNew"
println eagerStr
println lazyStr

// Should fail in MissingPropertyException
println "$name.firstName"
