# Naive-Bayes using Java

## About

A fun side program to perform naive-bayes algorithm using plain java code.

This code is dynamic for different datasets as long as all columns in the dataset are used and the last column is the result.

**Note:** For datasets not involving the first or first few columns such as the 3rd dataset example, change the iterations as commented in the code.

## Technology Stack

1. Developed using plain Java

## Developer

-  Adnan Hakim [github.com/adnanhakim](https://github.com/adnanhakim)

## Build

-  Change the dataset as required

## Datasets

### Dataset 1 - To predict if certain weather occurs

#### Example Set - < rain, hot, humid, false > (N)

| outlook  | temperature | humidity | windy | class |
| -------- | ----------- | -------- | ----- | ----- |
| sunny    | hot         | high     | false | N     |
| sunny    | hot         | high     | true  | N     |
| overcast | hot         | high     | false | P     |
| rain     | mild        | high     | false | P     |
| rain     | cool        | normal   | false | P     |
| rain     | cool        | normal   | true  | N     |
| overcast | cool        | normal   | true  | P     |
| sunny    | mild        | high     | false | N     |
| sunny    | cool        | normal   | false | P     |
| rain     | mild        | normal   | false | P     |
| sunny    | mild        | normal   | true  | P     |
| overcast | mild        | high     | true  | P     |
| overcast | hot         | normal   | false | P     |
| rain     | mild        | high     | true  | N     |

### Dataset 2 - To predict if a car with certain properties will be stolen or not

#### Example Set - < red, suv, domestic > (no)

| color  | type   | origin   | stolen |
| ------ | ------ | -------- | ------ |
| red    | sports | domestic | yes    |
| red    | sports | domestic | no     |
| red    | sports | domestic | yes    |
| yellow | sports | domestic | no     |
| yellow | sports | imported | yes    |
| yellow | suv    | imported | no     |
| yellow | suv    | imported | yes    |
| yellow | suv    | domestic | no     |
| red    | suv    | imported | no     |
| red    | sports | imported | yes    |

### Dataset 3 - To predict if a person under certain conditions will be suburned or not

#### Example Set - < brown, tall, average, no > (none)

| name  | hair   | height  | weight  | dublin | result    |
| ----- | ------ | ------- | ------- | ------ | --------- |
| Sarah | blonde | average | light   | no     | sunburned |
| Dana  | blonde | tall    | average | yes    | none      |
| Alex  | brown  | short   | average | yes    | none      |
| Annie | blonde | short   | average | no     | sunburned |
| Emily | red    | average | heavy   | no     | sunburned |
| Pete  | brown  | tall    | heavy   | no     | none      |
| John  | brown  | average | heavy   | no     | none      |
| Katie | brown  | short   | light   | yes    | none      |

### Dataset 4 - To predict if a person with certain properties will buy a computer or not

#### Example Set - < <=30, medium, yes, fair > (yes)

| age     | income | student | credit_rating | buys_computer |
| ------- | ------ | ------- | ------------- | ------------- |
| <=30    | high   | no      | fair          | no            |
| <=30    | high   | no      | excellent     | no            |
| 31...40 | high   | no      | fair          | yes           |
| >40     | medium | no      | fair          | yes           |
| >40     | low    | yes     | fair          | yes           |
| >40     | low    | yes     | excellent     | no            |
| 31...40 | low    | yes     | excellent     | yes           |
| <=30    | medium | no      | fair          | no            |
| <=30    | low    | yes     | fair          | yes           |
| >40     | medium | yes     | fair          | yes           |
| <=30    | medium | yes     | excellent     | yes           |
| 31...40 | medium | no      | excellent     | yes           |
| 31...40 | high   | yes     | fair          | yes           |
| >40     | medium | no      | excellent     | no            |

## MIT LICENSE

> Copyright (c) 2020 Adnan Hakim
>
> Permission is hereby granted, free of charge, to any person obtaining a copy
> of this software and associated documentation files (the "Software"), to deal
> in the Software without restriction, including without limitation the rights
> to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
> copies of the Software, and to permit persons to whom the Software is
> furnished to do so, subject to the following conditions:
>
> The above copyright notice and this permission notice shall be included in all
> copies or substantial portions of the Software.
>
> THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
> IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
> FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
> AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
> LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
> OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
> SOFTWARE.
