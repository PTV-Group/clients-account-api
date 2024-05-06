/*
 * Account API
 *
 * With the Account service you can manage your API keys and track their usage. It is important to note that unlike all other APIs, the Account API needs a master API key for authentication. For more details consult the [concept](./concepts/api-key-management-and-usage).
 *
 * The version of the OpenAPI document: 1.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.account.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.account.Model
{
    /// <summary>
    /// The total usage of all API keys of the subscription for the requested period.
    /// </summary>
    [DataContract(Name = "TotalUsage")]
    public partial class TotalUsage : IEquatable<TotalUsage>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TotalUsage" /> class.
        /// </summary>
        /// <param name="services">The total usage by service for the requested period. Only services which have been used in the requested period will be returned..</param>
        /// <param name="transactions">Transactions charged in total..</param>
        /// <param name="requests">Requests sent in total..</param>
        public TotalUsage(List<TotalServiceUsage> services = default(List<TotalServiceUsage>), double transactions = default(double), int requests = default(int))
        {
            this.Services = services;
            this.Transactions = transactions;
            this.Requests = requests;
        }

        /// <summary>
        /// The total usage by service for the requested period. Only services which have been used in the requested period will be returned.
        /// </summary>
        /// <value>The total usage by service for the requested period. Only services which have been used in the requested period will be returned.</value>
        [DataMember(Name = "services", EmitDefaultValue = false)]
        public List<TotalServiceUsage> Services { get; set; }

        /// <summary>
        /// Transactions charged in total.
        /// </summary>
        /// <value>Transactions charged in total.</value>
        [DataMember(Name = "transactions", EmitDefaultValue = false)]
        public double Transactions { get; set; }

        /// <summary>
        /// Requests sent in total.
        /// </summary>
        /// <value>Requests sent in total.</value>
        [DataMember(Name = "requests", EmitDefaultValue = false)]
        public int Requests { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TotalUsage {\n");
            sb.Append("  Services: ").Append(Services).Append("\n");
            sb.Append("  Transactions: ").Append(Transactions).Append("\n");
            sb.Append("  Requests: ").Append(Requests).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as TotalUsage);
        }

        /// <summary>
        /// Returns true if TotalUsage instances are equal
        /// </summary>
        /// <param name="input">Instance of TotalUsage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TotalUsage input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Services == input.Services ||
                    this.Services != null &&
                    input.Services != null &&
                    this.Services.SequenceEqual(input.Services)
                ) && 
                (
                    this.Transactions == input.Transactions ||
                    this.Transactions.Equals(input.Transactions)
                ) && 
                (
                    this.Requests == input.Requests ||
                    this.Requests.Equals(input.Requests)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Services != null)
                {
                    hashCode = (hashCode * 59) + this.Services.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Transactions.GetHashCode();
                hashCode = (hashCode * 59) + this.Requests.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
